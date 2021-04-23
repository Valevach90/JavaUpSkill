package example.printer;

import example.printer.printerSoft.IPrinter;
import example.printer.printerSoft.IReader;
import example.printer.printerSoft.Paper;
import example.soft.ICreateReport;
import example.soft.ITurnOff;
import example.soft.ITurnOn;

public class Printer implements ITurnOff, ITurnOn, ICreateReport, IPrinter, IReader {
    private int number;
    private IPrinter printer;
    private IReader reader;
    private String inPutText;

    public Printer(int number, IPrinter printer, IReader reader, String inPutText) {
        this.number = number;
        this.printer = printer;
        this.reader = reader;
        this.inPutText = inPutText;
    }

    public void doPrint(){
        String outPutText = reader.read();
        printer.print(outPutText);
    }

    public Paper makePrint() {
        return new Paper();
    }


    public void turnOff() {
        System.out.println("Printer is working");
    }

    public void turnOn() {
        System.out.println("Printer is stopping");
    }

    public void doReport() {
        System.out.println("Printer's number is "+number);
    }

    public void print(String text) {
        System.out.println(text);
    }

    public String read() {
        return inPutText;
    }
}
