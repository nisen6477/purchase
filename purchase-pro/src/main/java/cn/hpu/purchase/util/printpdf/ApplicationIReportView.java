package cn.hpu.purchase.util.printpdf;

import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import org.springframework.web.servlet.view.jasperreports.JasperReportsMultiFormatView;

import java.util.Map;

/**
 * SpringMVC + IReport整合 视图处理扩展
 * @author Bertram on 2017/7/19.
 */
public class ApplicationIReportView extends JasperReportsMultiFormatView {

    private JasperReport jasperReport;

    public ApplicationIReportView() {
        super();
    }

    @Override
    protected JasperPrint fillReport(Map<String, Object> model) throws Exception {
        if (model.containsKey("url")) {
            setUrl(String.valueOf(model.get("url")));
            this.jasperReport = loadReport();
        }

        return super.fillReport(model);
    }

    @Override
    protected JasperReport getReport() {
        return this.jasperReport;
    }
}
