package fr.tadiotto.masscrab3;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonPlaceHolderApi {

    @GET("articles")
    Call<List<Article>> getArticles();

    @GET("toparticles")
    Call<List<Article>> getTopArticles();

    @GET("logitech")
    Call<List<Article>> getLogitech();

    @GET("steelseries")
    Call<List<Article>> getSteelseries();

    @GET("razer")
    Call<List<Article>> getRazer();

    @GET("dxracer")
    Call<List<Article>> getDxracer();

    @GET("souris")
    Call<List<Article>> getSouris();

    @GET("clavier")
    Call<List<Article>> getClavier();

    @GET("casque")
    Call<List<Article>> getCasque();

    @GET("tapis")
    Call<List<Article>> getTapis();

    @GET("cle")
    Call<List<Article>> getCle();

    @GET("chaise")
    Call<List<Article>> getChaise();



}
