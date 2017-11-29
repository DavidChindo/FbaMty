package com.fibramty.fbmty.Network.Response;

import com.fibramty.fbmty.Network.Request.Models.ActivityHolding;
import com.fibramty.fbmty.Network.Request.Models.Address;
import com.fibramty.fbmty.Network.Request.Models.Contact;
import com.fibramty.fbmty.Network.Request.Models.Coordinate;
import com.fibramty.fbmty.Network.Request.Models.Office;
import com.fibramty.fbmty.Network.Request.Models.Picture;
import com.fibramty.fbmty.Network.Request.Models.Plan;
import com.fibramty.fbmty.Network.Request.Models.Service;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by david.barrera on 11/28/17.
 */

public class HoldingResponse {

    @SerializedName("Id")
    private long id;
    @SerializedName("Name")
    private String name;
    @SerializedName("Cooridinates")
    private Coordinate coordinates;
    @SerializedName("AddressObj")
    private Address address;
    @SerializedName("yearConstruction")
    private String yearConstruction;
    @SerializedName("areaTotal")
    private String areaTotal;
    @SerializedName("OfficesQty")
    private int officeQty;
    @SerializedName("Architect")
    private String architect;
    @SerializedName("Description")
    private String description;
    @SerializedName("holdingType")
    private String holdingType;
    @SerializedName("totalPrice")
    private String totalPrice;
    @SerializedName("officeObj")
    private Office office;
    @SerializedName("pictures")
    private ArrayList<Picture> pictures;
    @SerializedName("services")
    private ArrayList<Service> services;
    @SerializedName("activities")
    private ArrayList<ActivityHolding> activities;
    @SerializedName("avaiableOffices")
    private int availableOffice;
    @SerializedName("plans")
    private ArrayList<Plan> plans;
    @SerializedName("parkingBoxes")
    private int parkingBoxes;
    @SerializedName("Contact")
    private Contact contact;

    public HoldingResponse(long id, String name, Coordinate coordinates, Address address, String yearConstruction,
                           String areaTotal, int officeQty, String architect, String description, String holdingType,
                           String totalPrice, Office office, ArrayList<Picture> pictures, ArrayList<Service> services,
                           ArrayList<ActivityHolding> activities, int availableOffice, ArrayList<Plan> plans, int parkingBoxes, Contact contact) {
        this.id = id;
        this.name = name;
        this.coordinates = coordinates;
        this.address = address;
        this.yearConstruction = yearConstruction;
        this.areaTotal = areaTotal;
        this.officeQty = officeQty;
        this.architect = architect;
        this.description = description;
        this.holdingType = holdingType;
        this.totalPrice = totalPrice;
        this.office = office;
        this.pictures = pictures;
        this.services = services;
        this.activities = activities;
        this.availableOffice = availableOffice;
        this.plans = plans;
        this.parkingBoxes = parkingBoxes;
        this.contact = contact;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Coordinate getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinate coordinates) {
        this.coordinates = coordinates;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getYearConstruction() {
        return yearConstruction;
    }

    public void setYearConstruction(String yearConstruction) {
        this.yearConstruction = yearConstruction;
    }

    public String getAreaTotal() {
        return areaTotal;
    }

    public void setAreaTotal(String areaTotal) {
        this.areaTotal = areaTotal;
    }

    public int getOfficeQty() {
        return officeQty;
    }

    public void setOfficeQty(int officeQty) {
        this.officeQty = officeQty;
    }

    public String getArchitect() {
        return architect;
    }

    public void setArchitect(String architect) {
        this.architect = architect;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getHoldingType() {
        return holdingType;
    }

    public void setHoldingType(String holdingType) {
        this.holdingType = holdingType;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Office getOffice() {
        return office;
    }

    public void setOffice(Office office) {
        this.office = office;
    }

    public ArrayList<Picture> getPictures() {
        return pictures;
    }

    public void setPictures(ArrayList<Picture> pictures) {
        this.pictures = pictures;
    }

    public ArrayList<Service> getServices() {
        return services;
    }

    public void setServices(ArrayList<Service> services) {
        this.services = services;
    }

    public ArrayList<ActivityHolding> getActivities() {
        return activities;
    }

    public void setActivities(ArrayList<ActivityHolding> activities) {
        this.activities = activities;
    }

    public int getAvailableOffice() {
        return availableOffice;
    }

    public void setAvailableOffice(int availableOffice) {
        this.availableOffice = availableOffice;
    }

    public ArrayList<Plan> getPlans() {
        return plans;
    }

    public void setPlans(ArrayList<Plan> plans) {
        this.plans = plans;
    }

    public int getParkingBoxes() {
        return parkingBoxes;
    }

    public void setParkingBoxes(int parkingBoxes) {
        this.parkingBoxes = parkingBoxes;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }
}
