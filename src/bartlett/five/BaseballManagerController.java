package bartlett.five;

import javafx.beans.property.DoubleProperty;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class BaseballManagerController {
	
	private Main mainApp;
	
	@FXML
	private TextField field0;
	@FXML
	private TextField field1;
	@FXML
	private TextField field2;
	@FXML
	private TextField field3;
	@FXML
	private TextField field4;
	@FXML
	private TextField field5;
	@FXML
	private TextField field6;
	@FXML
	private TextField field7;
	@FXML
	private TextField field8;
	@FXML
	private TextField field9;
	@FXML
	private TextField field10;
	@FXML
	private TextField field11;
	@FXML
	private TextField field12;
	@FXML
	private TextField field13;
	@FXML
	private TextField field14;
	@FXML
	private TextField field15;
	@FXML
	private TextField field16;
	@FXML
	private TextField field17;
	@FXML
	private TextField field18;
	@FXML
	private TextField field19;
	@FXML
	private TextField field20;
	@FXML
	private TextField field21;
	@FXML
	private TextField field22;
	@FXML
	private TextField field23;
	@FXML
	private TextField field24;
	@FXML
	private TextField field25;
	@FXML
	private Button calculateButton;
	@FXML
	private TextField final0;
	@FXML
	private TextField final1;
	@FXML
	private TextField final2;
	@FXML
	private TextField final3;
	@FXML
	private TextField final4;
	@FXML
	private TextField final5;
	@FXML
	private TextField final6;
	@FXML
	private TextField final7;
	@FXML
	private TextField final8;
	@FXML
	private TextField final9;
	@FXML
	private TextField final10;
	@FXML
	private TextField final11;
	@FXML
	private TextField final12;
	@FXML
	private TextField final13;
	@FXML
	private TextField final14;
	@FXML
	private TextField final15;
	@FXML
	private TextField final16;
	@FXML
	private TextField final17;
	@FXML
	private TextField final18;
	@FXML
	private TextField final19;
	@FXML
	private TextField final20;
	@FXML
	private TextField final21;
	@FXML
	private TextField final22;
	@FXML
	private TextField final23;
	@FXML
	private TextField final24;
	@FXML
	private TextField final25;
	@FXML
	private TextField final26;
	@FXML
	private TextField final27;
	@FXML
	private TextField final28;
	@FXML
	private TextField final29;
	@FXML
	private TextField final30;
	@FXML
	private TextField final31;
	@FXML
	private TextField final32;
	@FXML
	private TextField final33;
	@FXML
	private TextField final34;
	@FXML
	private TextField final35;
	@FXML
	private TextField final36;
	@FXML
	private TextField final37;
	@FXML
	private TextField final38;
	@FXML 
	private MenuItem save;
	
	
	
	public BaseballManagerController(){
		
	}
	
	@FXML
	public void initialize(){
		
	}
	
	//method activated when button is pressed, contains methods that transfer statistics different ways
	public void calculateStats(){
		transferStats();
		calculateHits();
		calculateBattingAverage();
		calculateOBP();
		calculateSLG();
		calculatePABB();
		calculateBBPerK();
		calculateTB();
		calculateABHR();
		calculateQAB();
		calculateERA();
		calculateWHIP();
		calculateWinPercentage();
		calculateOPS();
	}
	
	//DONE
	//simple method that moves over the stats that will remain the same in the final table
	public void transferStats(){
		//Games played (hitting)
		final0.setText(field0.getText());
		
		//Plate appearances
		final1.setText(field1.getText());
		
		//At bats
		final2.setText(field2.getText());
		
		//Singles
		final4.setText(field3.getText());
		
		//Doubles
		final5.setText(field4.getText());
		
		//Triples
		final6.setText(field5.getText());
		
		//Home runs
		final7.setText(field6.getText());
		
		//RBIS
		final8.setText(field7.getText());
		
		//Runs
		final9.setText(field8.getText());
		
		//HBP
		final10.setText(field9.getText());
		
		//Reached on error
		final11.setText(field11.getText());
		
		//Fielders choice
		final12.setText(field12.getText());
		
		//Catcher interference
		final13.setText(field13.getText());
		
		//Walks
		final14.setText(field14.getText());
		
		//Strike outs
		final15.setText(field10.getText());
		
		//Sacrifices
		final24.setText(field15.getText());
		
		//Games pitched in
		final26.setText(field16.getText());
		
		//Innings pitched
		final27.setText(field17.getText());
		
		//Wins
		final28.setText(field18.getText());
		
		//Losses
		final29.setText(field19.getText());
		
		//Hits 
		final30.setText(field20.getText());
		
		//Runs
		final31.setText(field21.getText());
		
		//Earned Runs
		final32.setText(field22.getText());
		
		//Walks 
		final33.setText(field23.getText());
		
		//Strike outs
		final34.setText(field24.getText());
		
		//Hit by pitch
		final35.setText(field25.getText());
	}
	
	//DONE
	public void calculateHits(){
		Double num3 = Double.parseDouble(field3.getText());
		Double num4 = Double.parseDouble(field4.getText());
		Double num5 = Double.parseDouble(field5.getText());
		Double num6 = Double.parseDouble(field6.getText());
		Double result = num3+num4+num5+num6;
		final3.setText(Double.toString(result));
	
	}

	//DONE
	public void calculateBattingAverage(){
		double num3 = Double.parseDouble(final3.getText());
		double num2 = Double.parseDouble(field2.getText());
		double result = num3/num2;
		final16.setText(Double.toString(result));
	}
	
	//DONE
	public void calculateOBP(){
		double num3 = Double.parseDouble(final3.getText());
		double num14 = Double.parseDouble(field14.getText());
		double num13 = Double.parseDouble(field13.getText());
		double num12 = Double.parseDouble(field12.getText());
		double num11 = Double.parseDouble(field11.getText());
		double num9 = Double.parseDouble(field9.getText());
		double sum = num3+num14+num13+num12+num11+num9;
		double num1 = Double.parseDouble(field1.getText());
		double result = sum/num1;
		final17.setText(Double.toString(result));
	}

	//DONE
	public void calculateSLG(){
		double num3 = Double.parseDouble(field3.getText());
		double num4 = Double.parseDouble(field4.getText());
		double num5 = Double.parseDouble(field5.getText());
		double num6 = Double.parseDouble(field6.getText());
		double sum = num3+2*num4+3*num5+4*num6;
		double num2 = Double.parseDouble(field2.getText());
		double result = sum/num2;
		final18.setText(Double.toString(result));

	}
	
	//DONE
	public void calculatePABB(){
		double num1 = Double.parseDouble(field1.getText());
		double num14 = Double.parseDouble(field14.getText());
		double result = num1/num14;
		final20.setText(Double.toString(result));

	}
	
	//DONE
	public void calculateBBPerK(){
		double num14 = Double.parseDouble(field14.getText());
		double num10 = Double.parseDouble(field10.getText());
		double result = num14/num10;
		final21.setText(Double.toString(result));
	}
	
	//DONE
	public void calculateTB(){
		double num3 = Double.parseDouble(field3.getText());
		double num4 = Double.parseDouble(field4.getText());
		double num5 = Double.parseDouble(field5.getText());
		double num6 = Double.parseDouble(field6.getText());
		double result = num3+2*num4+3*num5+4*num6;
		final22.setText(Double.toString(result));
		
	}
	
	//DONE
	public void calculateABHR(){
		double num2 = Double.parseDouble(field2.getText());
		double num6 = Double.parseDouble(field6.getText());
		double result = num2/num6;
		final23.setText(Double.toString(result));
	}
	
	//DONE
	public void calculateQAB(){
		double num17 = Double.parseDouble(final17.getText());
		double num15 = Double.parseDouble(field15.getText());
		double num2 = Double.parseDouble(field2.getText());
		double quotient = num15/num2;
		double result = quotient+num17;
		final25.setText(Double.toString(result));
	}
	
	//DONE
	public void calculateERA(){
		double num22 = Double.parseDouble(field22.getText());
		double num17 = Double.parseDouble(field17.getText());
		double quotient = num22/num17;
		double result = 9*quotient;
		final36.setText(Double.toString(result));
	}
	
	//DONE
	public void calculateWHIP(){
		double num20 = Double.parseDouble(field20.getText());
		double num23 = Double.parseDouble(field23.getText());
		double num25 = Double.parseDouble(field25.getText());
		double num17 = Double.parseDouble(field17.getText());
		double sum = num20+num23+num25;
		double result = sum/num17;
		final37.setText(Double.toString(result));
		
	}
	
	//DONE
	public void calculateWinPercentage(){
		double num18 = Double.parseDouble(field18.getText());
		double num16 = Double.parseDouble(field16.getText());
		double result = num18/num16;
		final38.setText(Double.toString(result));
	}
	
	//DONE
	public void calculateOPS(){
		double num17 = Double.parseDouble(final17.getText());
		double num18 = Double.parseDouble(final18.getText());
		double result = num17+num18;
		final19.setText(Double.toString(result));
		
	}
	
	public void saveStats(){
	
	}
	public void setMainApp(Main mainApp){
		this.mainApp = mainApp;
	}
}
