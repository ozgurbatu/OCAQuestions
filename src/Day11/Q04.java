package Day11;

interface Exportable{
        void export(); // interface'te acces modifier yazilmasa da public'tir
        }
class Tool implements Exportable{
   /* protected */ public void export() {		             	// line n1 //ovirred eden method overrid edilen method'u kisitlayamaz
        System.out.println("Tool::export");
    }
}
class ReportTool extends Tool implements Exportable {
    public void export() {							// line n2
        System.out.println("RTool::export");
    }
    public static void main(String[] args) {
        Tool aTool = new ReportTool();
        Tool bTool = new Tool();
        callExport(aTool);
        callExport(bTool);
    }
    public static void callExport(Exportable ex) {
        ex.export();
    }
}
//What is the result?
//A.	Compilation fails only at line n2.
//B.	RTool::exportTool::export
//C.	Tool::exportTool:export
//D.	Compilation fails only at line n1.
//E.	Compilation fails at both line n1 and line n2.
