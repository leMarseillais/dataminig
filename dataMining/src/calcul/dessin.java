package calcul;

import java.io.File;
import java.io.IOException;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class dessin {

    public static void main(String[] args) {

	XYSeries series = new XYSeries("serie1");
	series.add(20.0, 10.0);
	series.add(40.0, 20.0);
	series.add(70.0, 50.0);
	XYSeriesCollection xySeriesCollection = new XYSeriesCollection();
	xySeriesCollection.addSeries(series);
	XYDataset xyDataset = new XYSeriesCollection(series);

	JFreeChart freeChart = ChartFactory.createXYLineChart(
		"Sample XY Chart", "height", "weight", xySeriesCollection,
		PlotOrientation.HORIZONTAL, true, true, false);
	try {
	    ChartUtilities.saveChartAsJPEG(new File("./test.jpg"), freeChart,
		    500, 300);
	} catch (IOException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}

    }
}
