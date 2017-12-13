package com.model;

import java.sql.Date;


public class Cs {
	
    private int EquNumber;
    private String EquName;
    private String EquQua;
    private String ModelSpe;
    private String EquDate;
    private String EquSta;
    private String EquClass;
    private String EquUnit;
    private String Manufacturer;
    private String Supplier;
    private String Specifications;
    private String OrderDate;
    private String Inspector;
    private String Quality;
    private String Maintainer;
    private String InventoryPosition;
    private String PresentPosition;
    private String UnitPrice;
    private int OrderQuantity;
    private String Handler;
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

    public String getEquDate() {
        return EquDate;
    }

    public void setEquDate(String EquDate) {
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

    public String getOrderDate() {
        return OrderDate;
    }

    public void setOrderDate(String OrderDate) {
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


    public int getOrderQuantity() {
        return OrderQuantity;
    }

    public void setOrderQuantity(int OrderQuantity) {
        this.OrderQuantity = OrderQuantity;
    }



    public String getHandler() {
        return Handler;
    }

    public void setHandler(String Handler) {
        this.Handler = Handler;
    }



    public void set(int EquNumber, String EquName, String EquQua,
        String ModelSpe, String EquDate, String EquSta, String EquClass,
        String EquUnit, String Manufacturer, String Supplier,
        String Specifications, String OrderDate, String Inspector,
        String Quality,String Maintainer,
        String InventoryPosition, String PresentPosition, String UnitPrice,
        int OrderQuantity,String Handler,String extra) {
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
        this.Maintainer = Maintainer;
        this.InventoryPosition = InventoryPosition;
        this.PresentPosition = PresentPosition;
        this.UnitPrice = UnitPrice;
        this.OrderQuantity = OrderQuantity;
        this.Handler = Handler;
        this.extra=extra;
    }
}
