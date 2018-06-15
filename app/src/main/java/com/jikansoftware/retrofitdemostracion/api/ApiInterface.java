package com.jikansoftware.retrofitdemostracion.api;

import com.jikansoftware.retrofitdemostracion.model.Contact;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("readcontacts.php")
    Call<List<Contact>> getContacts();
}
