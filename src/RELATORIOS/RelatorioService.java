/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RELATORIOS;
        
import CONTROLE.CRelatorio;
import DAO.BD;
import java.io.File;
import java.io.Serializable;
import java.util.HashMap;
import net.sf.jasperreports.engine.JRExporter;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.export.JRXlsExporter;
import net.sf.jasperreports.engine.util.JRLoader;
 
public class RelatorioService implements Serializable {
 
    private static final long serialVersionUID = 1L;
 
    private static final String FOLDER_RELATORIOS = "/relatorios";
    private String caminhoArquivoRelatorio = null;
    private JRExporter exporter = null;
    private File arquivoGerado = null;
    private CRelatorio cRelatorio;
    
    public RelatorioService(){
        cRelatorio = new CRelatorio();
    }
 
    public String gerarRelatorio(HashMap parametrosRelatorio,
            String nomeRelatorioJasper, String tipoExportar) throws Exception {
 
        String caminhoRelatorio = this.getClass()
                .getResource(FOLDER_RELATORIOS).getPath();
 
        /* caminho completo até o relatório compilado indicado */
        String caminhoArquivosJasper = caminhoRelatorio + File.separator
                + nomeRelatorioJasper + ".jasper";
 
        /* Faz o carregamento do relatório */
        JasperReport relatorioJasper = (JasperReport) JRLoader
                .loadObjectFromFile(caminhoArquivosJasper);
 
        /* Carrega o arquivo */
        JasperPrint impressoraJasper = JasperFillManager.fillReport(
                relatorioJasper, parametrosRelatorio, cRelatorio.relatorioDao.conectar());
 
        if (tipoExportar.equalsIgnoreCase("pdf")) {
            exporter = new JRPdfExporter();
        } else if (tipoExportar.equalsIgnoreCase("xls")) {
            exporter = new JRXlsExporter();
        }
 
        /* Caminho relatorio exportado */
        caminhoArquivoRelatorio = caminhoRelatorio + File.separator
                + nomeRelatorioJasper + "." + tipoExportar;
 
        /* Criar novo arquivos exportado */
 
        arquivoGerado = new File(caminhoArquivoRelatorio);
 
        /* Prepara a impressão */
        exporter.setParameter(JRExporterParameter.JASPER_PRINT,
                impressoraJasper);
 
        exporter.setParameter(JRExporterParameter.OUTPUT_FILE, arquivoGerado);
 
        /* Excuta a exportação */
        exporter.exportReport();
 
        return caminhoArquivoRelatorio;
 
    }
 
}