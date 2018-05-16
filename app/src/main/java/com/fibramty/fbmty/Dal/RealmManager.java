package com.fibramty.fbmty.Dal;

import android.util.Log;

import com.fibramty.fbmty.Network.Request.Models.Payment;
import com.fibramty.fbmty.Network.Response.LoginResponse;

import java.util.ArrayList;
import java.util.List;

import io.realm.Case;
import io.realm.Realm;
import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.RealmResults;

/**
 * Created by david.barrera on 11/29/17.
 */

public class RealmManager {

    public static void saveUser(final LoginResponse usr, Realm realm){

        realm.executeTransaction(new Realm.Transaction() {
            @Override
            public void execute(Realm realm) {
                realm.copyToRealmOrUpdate(usr);
            }
        });
    }

    public static void  deleteRealm(){
        Realm realm = Realm.getDefaultInstance();
        realm.executeTransaction(new Realm.Transaction() {
            @Override
            public void execute(Realm realm) {
                realm.deleteAll();
            }
        });
    }

    public static <T extends RealmObject> void deleteClass(final Class<T> aClass, String option){
        Realm realm = Realm.getDefaultInstance();
        final RealmResults<T> realmResults = realm.where(aClass).equalTo("needAuth",option).findAll();
        try{
            if (realmResults.size() > 0 ){
                realm.executeTransaction(new Realm.Transaction() {
                    @Override
                    public void execute(Realm realm) {
                        boolean delete = realmResults.deleteAllFromRealm();
                        Log.d("Deleted", "VALUE " + delete);
                    }
                });
            }
            realm.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static <T extends RealmObject> RealmList<T> list(Realm realm, Class<T> aClass) {
        RealmResults<T> realmResults = realm.where(aClass).findAll();
        RealmList<T> realmList = new RealmList<>();
        for (T result : realmResults) {
            realmList.add(result);
        }
        return realmList;
    }

    public static  List<String> listUnique(Realm realm){
        RealmResults<Payment> uniques = realm.where(Payment.class).distinct("dateValidity").findAll();
        List<String> dateFilters = new ArrayList<>();
        for (Payment dates : uniques){
            dateFilters.add(dates.getDateValidity());
        }
        return dateFilters;
    }

    public static <T extends RealmObject> void insert(Realm realm, final RealmList<T> items) {
        realm.executeTransaction(new Realm.Transaction() {
            @Override
            public void execute(Realm realm) {
                realm.copyToRealmOrUpdate(items);
            }
        });
    }

    public static <T extends RealmObject> void insert(Realm realm, final ArrayList<T> items) {
        realm.executeTransaction(new Realm.Transaction() {
            @Override
            public void execute(Realm realm) {
                realm.copyToRealmOrUpdate(items);
            }
        });
    }

    public static <T extends RealmObject> void insert(Realm realm, final List<T> items) {
        realm.executeTransaction(new Realm.Transaction() {
            @Override
            public void execute(Realm realm) {
                realm.copyToRealmOrUpdate(items);
            }
        });
    }

    public static <T extends RealmObject> T findFirst(Realm realm, Class<T> tClass) {
        if (realm == null) {
            realm = Realm.getDefaultInstance();
            return realm.where(tClass).findFirst();
        } else {
            if (!realm.isClosed()) {
                return realm.where(tClass).findFirst();
            }
        }
        return null;
    }

    public static <T extends RealmObject> RealmList<T> findByProvider(Class<T> aClass,String fieldName,String value) {
        Realm realm = Realm.getDefaultInstance();
        RealmResults<T> realmResults = realm.where(aClass).contains(fieldName,value, Case.INSENSITIVE).findAllAsync();
        RealmList<T> realmList = new RealmList<>();
        for (T result : realmResults){
            realmList.add(result);
        }
        realm.close();
        return realmList;
    }

    public static <T extends RealmObject> RealmList<T> findByProviderNotRegister(Class<T> aClass,String fieldName,String value) {
        Realm realm = Realm.getDefaultInstance();
        RealmResults<T> realmResults = realm.where(aClass).equalTo(fieldName,value).findAllAsync();
        RealmList<T> realmList = new RealmList<>();
        for (T result : realmResults){
            realmList.add(result);
        }
        realm.close();
        return realmList;
    }


    public static <T extends RealmObject> RealmList<T> findByDescription(Class<T> aClass,String fieldName,String value,String fieldName2,String value2) {
        Realm realm = Realm.getDefaultInstance();
        RealmResults<T> realmResults = realm.where(aClass).equalTo(fieldName,value).findAll();
        RealmResults<T> realmResultsFilter =  realmResults.where().contains(fieldName2,value2,Case.INSENSITIVE).findAll();
        RealmList<T> realmList = new RealmList<>();
        for (T result : realmResultsFilter){
            realmList.add(result);
        }
        realm.close();
        return realmList;
    }

    public static <T extends RealmObject> List<T> findPayments(Class<T> aClassm, String value,  String value2){
        try {
            Realm realm = Realm.getDefaultInstance();
            RealmResults<T> results = realm.where(aClassm)
                    .equalTo("dateValidity", value)
                    .and()
                    .equalTo("status", value2)
                    .findAll();
            List<T> realmList = new ArrayList<>();
            for (T result : results) {
                realmList.add(result);
            }
            return realmList;
        }catch (Exception e){
            e.printStackTrace();
            return new ArrayList<>();
        }
    }


    public static <T extends RealmObject> RealmList<T> findById(Class<T> aClass,String fieldName,String value) {
        Realm realm = Realm.getDefaultInstance();
        RealmResults<T> realmResults = realm.where(aClass).equalTo(fieldName,value).findAll();
        RealmList<T> realmList = new RealmList<>();
        for (T result : realmResults){
            realmList.add(result);
        }
        realm.close();
        return realmList;
    }

    public static String token() {
        Realm realm = Realm.getDefaultInstance();
        String jwt = "";
        if (realm == null) {
            realm = Realm.getDefaultInstance();
            jwt = realm.where(LoginResponse.class).findFirst().getToken();
        } else {
            if (!realm.isClosed()) {
                jwt = realm.where(LoginResponse.class).findFirst().getToken();
            }
        }
        realm.close();
        return jwt;
    }

    public static String user() {
        Realm realm = Realm.getDefaultInstance();
        String user = "";
        if (realm == null) {
            realm = Realm.getDefaultInstance();
            user = realm.where(LoginResponse.class).findFirst().getUserName();
        } else {
            if (!realm.isClosed()) {
                user = realm.where(LoginResponse.class).findFirst().getUserName();
            }
        }
        realm.close();
        return user;
    }


}
