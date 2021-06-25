package pe.edu.ulima.pm.melendez_hualpa_trabajo3.models.dao

import pe.edu.ulima.pm.melendez_hualpa_trabajo3.models.beans.Comp
import retrofit2.Call
import retrofit2.http.GET
import java.util.ArrayList

interface Service {
    @GET("/competitions")
    fun getDevices() : Call<ArrayList<Comp>>
}