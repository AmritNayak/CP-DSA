package hrcautomation;

public class Milestone_pojo {

    private String userId, reason, cases, pounds, itemDescription, size, unitPrice, broker, vendorNumber;
    private int invoiceCode, pack;

    public String getBroker() {
        return broker;
    }

    public void setBroker(String broker) {
        this.broker = broker;
    }

    public String getVendorNumber() {
        return vendorNumber;
    }

    public void setVendorNumber(String vendorNumber) {
        this.vendorNumber = vendorNumber;
    }

    public String userId() {
        return userId;
    }
    public void setuserId(String userId) {
        this.userId = userId;
    }
    public String getreason() {
        return reason;
    }
    public void setreason(String reason) {
        this.reason = reason;
    }
    public String getcases() {
        return cases;
    }
    public void setcases(String cases) {
        this.cases = cases;
    }
    public String getpounds() {
        return pounds;
    }
    public void setpounds(String pounds) {
        this.pounds = pounds;
    }

    public String getitemDescription() {
        return itemDescription;
    }
    public void setitemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }
    public String getsize() {
        return size;
    }
    public void setsize(String size) {
        this.size = size;
    }
    public String getunitPrice() {
        return unitPrice;
    }
    public void setunitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
    }
    public int getinvoiceCode() {
        return invoiceCode;
    }
    public void setinvoiceCode(int invoiceCode) {
        this.invoiceCode = invoiceCode;
    }
    public int getpack() {
        return pack;
    }
    public void setpack(int pack) {
        this.pack = pack;
    }

    @Override
    public String toString() {
        return "Milestone_pojo{" +
                "userId='" + userId + '\'' +
                ", reason='" + reason + '\'' +
                ", cases='" + cases + '\'' +
                ", pounds='" + pounds + '\'' +
                ", itemDescription='" + itemDescription + '\'' +
                ", size='" + size + '\'' +
                ", unitPrice='" + unitPrice + '\'' +
                ", broker='" + broker + '\'' +
                ", vendorNumber='" + vendorNumber + '\'' +
                ", invoiceCode=" + invoiceCode +
                ", pack=" + pack +
                '}';
    }
}


