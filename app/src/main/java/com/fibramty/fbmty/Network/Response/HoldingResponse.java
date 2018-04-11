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

    @SerializedName("Administrador")
    private String administrator;
    @SerializedName("AdministradorMail")
    private String admonEmail;
    @SerializedName("AdministradorNumero")
    private String admonPhoneNumber;
    @SerializedName("Id")
    private long id;
    @SerializedName("IdParentHolding")
    private long idParentHolding;
    @SerializedName("IdSAP")
    private String idSAP;
    @SerializedName("NombreEdificio")
    private String name;
    @SerializedName("Coordinates")
    private Coordinate coordinates;
    @SerializedName("Address")
    private Address address;
    @SerializedName("AniosContruccion")
    private String yearConstruction;
    @SerializedName("areaTotal")
    private String areaTotal;
    @SerializedName("OfficesQty")
    private int officeQty;
    @SerializedName("Arquitecto")
    private String architect;
    @SerializedName("Descripcion")
    private String description;
    @SerializedName("TipoPropiedad")
    private String holdingType;
    @SerializedName("PrecioTotal")
    private String totalPrice;
    @SerializedName("officeObj")
    private Office office;
    @SerializedName("Picture")
    private PicturesResponse pictures;
    @SerializedName("ServiceTickets")
    private ArrayList<Service> services;
    @SerializedName("ActivityHolding")
    private ArrayList<ActivityHolding> activities;
    @SerializedName("avaiableOffices")
    private int availableOffice;
    @SerializedName("plans")
    private ArrayList<Plan> plans;
    @SerializedName("Estacionamientos")
    private int parkingBoxes;
    @SerializedName("Contact")
    private Contact contact;
    @SerializedName("HoldingExtraProperties")
    private String extrasProperties;

    public HoldingResponse(String administrator, long id, long idParentHolding, String idSAP, String name, Coordinate coordinates, Address address, String yearConstruction, String areaTotal, int officeQty, String architect, String description, String holdingType, String totalPrice, Office office, PicturesResponse pictures, ArrayList<Service> services, ArrayList<ActivityHolding> activities, int availableOffice, ArrayList<Plan> plans, int parkingBoxes, Contact contact, String extrasProperties) {
        this.administrator = administrator;
        this.id = id;
        this.idParentHolding = idParentHolding;
        this.idSAP = idSAP;
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
        this.extrasProperties = extrasProperties;
    }

    public String getAdministrator() {
        return administrator;
    }

    public void setAdministrator(String administrator) {
        this.administrator = administrator;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIdParentHolding() {
        return idParentHolding;
    }

    public void setIdParentHolding(long idParentHolding) {
        this.idParentHolding = idParentHolding;
    }

    public String getIdSAP() {
        return idSAP;
    }

    public void setIdSAP(String idSAP) {
        this.idSAP = idSAP;
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

    public PicturesResponse getPictures() {
        return pictures;
    }

    public void setPictures(PicturesResponse pictures) {
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

    public String getExtrasProperties() {
        return extrasProperties;
    }

    public void setExtrasProperties(String extrasProperties) {
        this.extrasProperties = extrasProperties;
    }

    public String getAdmonEmail() {
        return admonEmail;
    }

    public void setAdmonEmail(String admonEmail) {
        this.admonEmail = admonEmail;
    }

    public String getAdmonPhoneNumber() {
        return admonPhoneNumber;
    }

    public void setAdmonPhoneNumber(String admonPhoneNumber) {
        this.admonPhoneNumber = admonPhoneNumber;
    }
}
