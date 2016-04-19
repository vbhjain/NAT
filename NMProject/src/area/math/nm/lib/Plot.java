package area.math.nm.lib;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
//import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.title.LegendTitle;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.ui.RefineryUtilities;

public class Plot 
{
    private double x[];
    private double y[];
    
    private String xLabel;
    private String yLabel;
    private String title;
    final private XYDataset  xyDataset;
    final XYSeriesCollection dataset;
    private PlotOrientation orientation;
    private boolean legend;
    private boolean tooltips;
    private boolean url;
    
    //private JPanel jChartPanel;
    private JFrame chartFrame;
    private JPanel jp;
    private JFreeChart chart;
    private JPanel add_chart;
    
    public Plot()
    {
        x = new double[0];
        y = new double[0];
        xLabel = "X";
        yLabel = "Y";
        title = "";
        xyDataset = null;
        dataset = new XYSeriesCollection();
        orientation = PlotOrientation.VERTICAL;
        legend = true;
        tooltips = false;
        url = false;
        
        add_chart = null;
        
        chartFrame = new JFrame();
        chartFrame.setSize(700, 500);
        jp = new JPanel();
        //chartPanel.setSize(chartFrame.getSize());
        
        //chartPanel.setBackground(Color.yellow);
        chartFrame.add(jp);
        
        //chartFrame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        chartFrame.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        RefineryUtilities.centerFrameOnScreen(chartFrame);
        //chartPanel.setVisible(true);
        //chartFrame.setVisible(true);
    }
    public Plot(JPanel cp)
    {
        x = new double[0];
        y = new double[0];
        xLabel = "X";
        yLabel = "Y";
        title = "";
        xyDataset = null;
        dataset = new XYSeriesCollection();
        orientation = PlotOrientation.VERTICAL;
        legend = true;
        tooltips = false;
        url = false;
        
        /*Commented
        chartFrame = new JFrame();
        chartFrame.setSize(700, 500);
        * 
        */
        jp = new JPanel();
        add_chart = cp;
        add_chart.removeAll();
        add_chart.add(jp);
        
        //chartPanel.setSize(chartFrame.getSize());
        
        //chartPanel.setBackground(Color.yellow);
        /*commented
        chartFrame.add(jp);
        */
        //chartFrame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        /*commented
        chartFrame.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        RefineryUtilities.centerFrameOnScreen(chartFrame);
        * */
        //chartPanel.setVisible(true);
        //chartFrame.setVisible(true);
    }
    
    
    /**
     * Creates a sample dataset.
     * 
     * @return a sample dataset.
    **/ 
    private XYDataset createDataset() 
    {  
        final XYSeries series = new XYSeries("Series " + Math.random());
        
        for (int i=0;i<x.length;i++)
        {
            series.add(x[i], y[i]);
        }    
        
        //final XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(series);
        return dataset;
    }
    private XYDataset createDataset(String legend) 
    {  
        final XYSeries series = new XYSeries(legend);
        
        for (int i=0;i<x.length;i++)
        {
            series.add(x[i], y[i]);
        }    
        
        //final XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(series);
        return dataset;
    }
     
    //Getter Methods
        public double[] getXValues()
        {
            return x;
        }
        public double[] getYValues()
        {
            return y;
        }
        public String getXLabel()
        {
            return xLabel;
        }
        public String getYLabel()
        {
            return yLabel;
        }
        public String getTitle()
        {
            return title;
        }
        public XYDataset getXYDataset()
        {
            return xyDataset;
        }
        public PlotOrientation getPlotOrientation()
        {
            return orientation;
        }
        public boolean getLegend()
        {
            return legend;
        }
        public boolean getTooltips()
        {
            return tooltips;
        }
        public boolean getURL()
        {
            return url;
        }
    
    //Setter Methods
        public void setXValues(double arg_x[])
        {
            x = arg_x;
        }
        public void setYValues(double arg_y[])
        {
            y = arg_y;
        }
        public void setXLabel(String arg_xLabel)
        {
            xLabel = arg_xLabel;
        }
        public void setYLabel(String arg_yLabel)
        {
            yLabel = arg_yLabel;
        }
        public void setTitle(String arg_title)
        {
            title = arg_title;
        }
        public void setXYDataset(XYDataset arg_xyDataset)
        {
            //xyDataset = arg_xyDataset;
        }
        public void setPlotOrientation(PlotOrientation arg_orientation)
        {
            orientation = arg_orientation;
        }
        public void setLegend(boolean arg_legend)
        {
            legend = arg_legend;
        }
        public void setTooltips(boolean arg_tooltips)
        {
            tooltips = arg_tooltips;
        }
        public void setURL(boolean arg_url)
        {
            url = arg_url;
        }
//ADD ADDITIONAL methods for chart
        
        //Plot graph
            
            public void plot(double arg_x[],double arg_y[])
            {
                x = arg_x;
                y = arg_y;
                xLabel = "X";
                yLabel = "Y";
                title = title;
                final XYDataset ds = createDataset();
                orientation = PlotOrientation.VERTICAL;
                legend = true;
                tooltips = true;
                url = false;
                
                plotIt(ds);
            }
            public void plot(double arg_x[],double arg_y[],String legend_title)
            {
                x = arg_x;
                y = arg_y;
                xLabel = "X";
                yLabel = "Y";
                title = title;
                final XYDataset ds = createDataset(legend_title);
                orientation = PlotOrientation.VERTICAL;
                legend = true;
                tooltips = true;
                url = false;
                
                plotIt(ds);
            }
            
            private void plotIt(XYDataset ds)
            {
                // create the chart...
                    chart = ChartFactory.createXYLineChart(
                        title,      // chart title
                        xLabel,                      // x axis label
                        yLabel,                      // y axis label
                        ds,                  // data
                        orientation,
                        legend,                     // include legend
                        tooltips,                     // tooltips
                        url                     // urls
                    );
                        
                // NOW DO SOME OPTIONAL CUSTOMISATION OF THE CHART...
                        chart.setBackgroundPaint(Color.WHITE);
                        //chart.setBorderVisible(false);
                // OPTIONAL CUSTOMISATION COMPLETED.
                    //ChartFrame demo = new ChartFrame("Plot 2D Graph", chart);
                    ChartPanel demo = new ChartPanel(chart);
                    
                    if(add_chart==null)
                    {
                        chartFrame.remove(jp);
                        demo.setSize(chartFrame.getSize());
                        chartFrame.add(demo);
                        //RefineryUtilities.centerFrameOnScreen(chartFrame);
                        demo.setVisible(true);
                        //chartPanel.setVisible(true);
                        //Refresh JFrame    
                            chartFrame.revalidate();
                            chartFrame.repaint();
                            chartFrame.setVisible(true);
                    }
                    else
                    {
                        add_chart.remove(jp);
                        demo.setSize(add_chart.getSize());
                        add_chart.add(demo);
                        //RefineryUtilities.centerFrameOnScreen(chartFrame);
                        demo.setVisible(true);
                        //chartPanel.setVisible(true);
                        //Refresh JPanel---->Container
                            add_chart.revalidate();
                            add_chart.repaint();
                            add_chart.setVisible(true);
                    }
                    jp=demo;
            }
}
