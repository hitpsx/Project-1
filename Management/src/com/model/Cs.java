package com.model;

import java.sql.Date;


public class Cs {
	
    private int EquNumber;
    private String EquName;
    private String EquQua;
    private String ModelSpe;
    private Date EquDate;
    private String EquSta;
    private String EquClass;
    private String EquUnit;
    private String Manufacturer;
    private String Supplier;
    private String Specifications;
    private Date OrderDate;
    private String Inspector;
    private String Quality;
    private Date MaintenanceDate;
    private String Maintainer;
    private String InventoryPosition;
    private String PresentPosition;
    private String UnitPrice;
    private String TotalPrice;
    private String Batch;
    private int OrderQuantity;
    private int ArrivalQuantity;
    private String Handler;
    private String Lender;
    private String extra;

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public String getEquSta() {
        return EquSta;
    }

    public void setEquSta(String EquSta) {
        this.EquSta = EquSta;
    }

    public String getEquClass() {
        return EquClass;
    }

    public void setEquClass(String EquClass) {
        this.EquClass = EquClass;
    }

    public String getEquUnit() {
        return EquUnit;
    }

    public void setEquUnit(String EquUnit) {
        this.EquUnit = EquUnit;
    }

    public int getEquNumber() {
        return EquNumber;
    }

    public void setEquNumber(int EquNumber) {
        this.EquNumber = EquNumber;
    }

    public String getEquName() {
        return EquName;
    }

    public void setEquName(String EquName) {
        this.EquName = EquName;
    }

    public Date getEquDate() {
        return EquDate;
    }

    public void setEquDate(Date EquDate) {
        this.EquDate = EquDate;
    }

    public String getEquQua() {
        return EquQua;
    }

    public void setEquQua(String EquQua) {
        this.EquQua = EquQua;
    }

    public String getModelSpe() {
        return ModelSpe;
    }

    public void setModelSpe(String ModelSpe) {
        this.ModelSpe = ModelSpe;
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public void setManufacturer(String Manufacturer) {
        this.Manufacturer = Manufacturer;
    }

    public String getSupplier() {
        return Supplier;
    }

    public void setSupplier(String Supplier) {
        this.Supplier = Supplier;
    }

    public String getSpecifications() {
        return Specifications;
    }

    public void setSpecifications(String Specifications) {
        this.Specifications = Specifications;
    }

    public Date getOrderDate() {
        return OrderDate;
    }

    public void setOrderDate(Date OrderDate) {
        this.OrderDate = OrderDate;
    }

    public String getInspector() {
        return Inspector;
    }

    public void setInspector(String Inspector) {
        this.Inspector = Inspector;
    }

    public String getQuality() {
        return Quality;
    }

    public void setQuality(String Quality) {
        this.Quality = Quality;
    }

    public Date getMaintenanceDate() {
        return MaintenanceDate;
    }

    public void setMaintenanceDate(Date MaintenanceDate) {
        this.MaintenanceDate = MaintenanceDate;
    }

    public String getMaintainer() {
        return Maintainer;
    }

    public void setMaintainer(String Maintainer) {
        this.Maintainer = Maintainer;
    }

    public String getInventoryPosition() {
        return InventoryPosition;
    }

    public void setInventoryPosition(String InventoryPosition) {
        this.InventoryPosition = InventoryPosition;
    }

    public String getPresentPosition() {
        return PresentPosition;
    }

    public void setPresentPosition(String PresentPosition) {
        this.PresentPosition = PresentPosition;
    }

    public String getUnitPrice() {
        return UnitPrice;
    }

    public void setUnitPrice(String UnitPrice) {
        this.UnitPrice = UnitPrice;
    }
    public String getTotalPrice() {
        return TotalPrice;
    }

    public void setTotalPrice(String TotalPrice) {
        this.TotalPrice = TotalPrice;
    }

    public String getBatch() {
        return Batch;
    }

    public void setBatch(String Batch) {
        this.Batch = Batch;
    }

    public int getOrderQuantity() {
        return OrderQuantity;
    }

    public void setOrderQuantity(int OrderQuantity) {
        this.OrderQuantity = OrderQuantity;
    }

    public int getArrivalQuantity() {
        return ArrivalQuantity;
    }

    public void setArrivalQuantity(int ArrivalQuantity) {
        this.ArrivalQuantity = ArrivalQuantity;
    }

    public String getHandler() {
        return Handler;
    }

    public void setHandler(String Handler) {
        this.Handler = Handler;
    }

    public String getLender() {
        return Lender;
    }

    public void setLender(String Lender) {
        this.Lender = Lender;
    }

    public void set(int EquNumber, String EquName, String EquQua,
        String ModelSpe, Date EquDate, String EquSta, String EquClass,
        String EquUnit, String Manufacturer, String Supplier,
        String Specifications, Date OrderDate, String Inspector,
        String Quality, Date MaintenanceDate, String Maintainer,
        String InventoryPosition, String PresentPosition, String UnitPrice,
        String TotalPrice, String Batch, int OrderQuantity,
        int ArrivalQuantity, String Handler, String Lender) {
        this.EquNumber = EquNumber;
        this.EquName = EquName;
        this.EquQua = EquQua;
        this.ModelSpe = ModelSpe;
        this.EquDate = EquDate;
        this.EquSta = EquSta;
        this.EquClass = EquClass;
        this.EquUnit = EquUnit;
        this.Manufacturer = Manufacturer;
        this.Supplier = Supplier;
        this.Specifications = Specifications;
        this.OrderDate = OrderDate;
        this.Inspector = Inspector;
        this.Quality = Quality;
        this.MaintenanceDate = MaintenanceDate;
        this.Maintainer = Maintainer;
        this.InventoryPosition = InventoryPosition;
        this.PresentPosition = PresentPosition;
        this.UnitPrice = UnitPrice;
        this.TotalPrice = TotalPrice;
        this.Batch = Batch;
        this.OrderQuantity = OrderQuantity;
        this.ArrivalQuantity = ArrivalQuantity;
        this.Handler = Handler;
        this.Lender = Lender;
    }
}
