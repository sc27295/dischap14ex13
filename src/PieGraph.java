import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.layout.VBox;

public class PieGraph extends Application {
    public static void main(String[] args) {//Call the method
        launch(args);
    }
    public void start(Stage stage){
        //initiakize the data values to pie chart
        ObservableList pieChartData=FXCollections.observableArrayList(
                new PieChart.Data("Final-40%",40),
                new PieChart.Data("MID-30%",30),
                new PieChart.Data("Quiz-10%",10),
                new PieChart.Data("project-20%",20)
                );
        //Create a PieChart class object
        final PieChart pieChart=new PieChart(pieChartData);
        pieChart.setLegendVisible(false);
        //Add piechart to VBOC
        VBox vbox=new VBox(pieChart);
        //Create a Scene class's project
        Scene scene=new Scene(vbox,400,200);
        stage.setScene(scene);
        stage.setTitle("PIE CHART");
        stage.setMaxHeight(400);
        stage.setWidth(400);
        stage.show();

    }
    private void colorSequence(ObservableList pieChartData,String... pieColors)
    {int i=0;
    for (PieChart.Data data: pieChartData)
        {data.getNode().setStyle("-fx-pie-color: "+pieColors[i%pieColors.length]+"''");
        i++;
        }

    }
}
