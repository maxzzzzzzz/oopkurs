package maxoop.model;

import maxoop.services.Bill.impls.BillServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ilost on 06.04.2017.
 */
public class Main {
    public static void main(String[] args){
//        ApplicationContext check = new ClassPathXmlApplicationContext("bill-context.xml");
//        Bill bill1 = (Bill) check.getBean("Bill1");
//        Bill bill2 = (Bill) check.getBean("Bill2");
//        Bill bill3 = (Bill) check.getBean("Bill3");
//        Bill bill4 = (Bill) check.getBean("Bill4");
//        Bill bill5 = (Bill) check.getBean("Bill5");
//        Bill bill6 = (Bill) check.getBean("Bill6");
//        Bill bill7 = (Bill) check.getBean("Bill7");
//        Bill bill8 = (Bill) check.getBean("Bill8");
//        Bill bill9 = (Bill) check.getBean("Bill9");
//        Bill bill10 = (Bill) check.getBean("Bill10");
//
//
//
//        ArrayList<Bill> arrayList = new ArrayList<Bill>();
//        arrayList.add(bill1);
//        arrayList.add(bill2);
//        arrayList.add(bill3);
//        arrayList.add(bill4);
//        arrayList.add(bill5);
//        arrayList.add(bill6);
//        arrayList.add(bill7);
//        arrayList.add(bill8);
//        arrayList.add(bill9);
//        arrayList.add(bill10);
//
//        for (int i=0;i<arrayList.size();i++){
//            System.out.println(arrayList.get(i));
//        }
        System.out.println("********************************");
        ApplicationContext context = new ClassPathXmlApplicationContext("context/spring-context.xml");
        BillServiceImpl service_bill = (BillServiceImpl) context.getBean("service_bill");
        service_bill.showAll();










    }
}
