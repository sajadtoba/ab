package table;
import base.CommonAPI;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TableData extends CommonAPI {
    public void readTable(){
        // extends CommonAPI to use / fetch the method
        // We are going to use the created method inside the CommonAPI
        // I need to find out more than one webelements that way we need to use the list // path has 2 calsses.
        String name = getTextByCss(".w3-table-all.notranslate tr:nth-child(4) td:nth-child(2)");
        // We can find two at the same time.
        String name2 = getTextByCss(".w3-table-all.notranslate tr:nth-child(5) td:nth-child(3)");
        String name3 = getTextByCss(".w3-table-all.notranslate tr:nth-child(5) td:nth-child(2)");
        String name4 = getTextByCss(".w3-table-all.notranslate tr:nth-child(6) td:nth-child(3)");
        String name5 = getTextByCss(".w3-table-all.notranslate tr:nth-child(5) td:nth-child(4)");
        String name6 = getTextByCss(".w3-table-all.notranslate tr:nth-child(5) td:nth-child(2)");
        String name7 = getTextByCss(".w3-table-all.notranslate tr:nth-child(3) td:nth-child(3)");
        System.out.println(name);
        System.out.println(name2);
        System.out.println(name3);
        System.out.println(name4);
        System.out.println(name5);
        System.out.println(name6);
        System.out.println(name7);
    }
    // Create a new method if you want to read the rows
//    public void readTableRow(){
//        // create a new variable String datatype
//        String name = getTextByCss(".w3-table-all.notranslate tr td");
//        System.out.println(name);
//    }
    // how to get the whole Table information

//    public void readTableRow(){
//        // create a List and call the method created inside the CommonAPI(method I gave the no.20)
//        List<WebElement> tableWebElements = getListOfWebElementsByCss(".w3-table-all.notranslate tr");
//        // create another list and use another method from the CommonAPI(29, line no.402)
//        List<String> getTableData = getListOfString(tableWebElements);
//        // we are going to use the for loop as we found all the  as String (elements) and saved inside the 2nd List
//        for(String st:getTableData){
//            System.out.println(st);
//        }
//    }

    public void readTableRow(){
        // create a List and call the method created inside the CommonAPI(method I gave the no.20)
        List<WebElement> tableWebElements = getListOfWebElementsByCss(".w3-table-all.notranslate");
        // create another list and use another method from the CommonAPI(29, line no.402)
        List<String> getTableData = getListOfString(tableWebElements);
        // we are going to use the for loop as we found all the  as String (elements) and saved inside the 2nd List
        for(String st:getTableData){
            System.out.println(st);
        }
    }


}
