public class InvoiceItem {
    private String id,desc;
    private int qty;
    private double unitPrice;
    public InvoiceItem(String id,String desc,int qty,double unitPrice){
        this.unitPrice=unitPrice;
        this.qty=qty;
        this.desc=desc;
        this.id=id;
    }
    public String getId(){
        return id;
    }

    public String getDesc() {
        return desc;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
    public double getTotal(){
        return unitPrice*qty;
    }

    @Override
    public String toString() {
        return ("InvoiceItem [id= "+id+",desc= "+desc+",qty= "+qty+"unitPrice= "+unitPrice+"]");
    }
}
