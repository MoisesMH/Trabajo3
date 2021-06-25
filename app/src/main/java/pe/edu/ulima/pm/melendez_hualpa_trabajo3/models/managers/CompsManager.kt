package pe.edu.ulima.pm.melendez_hualpa_trabajo3.models.managers

import android.app.admin.DeviceAdminService
import pe.edu.ulima.pm.melendez_hualpa_trabajo3.models.beans.Comp
import pe.edu.ulima.pm.melendez_hualpa_trabajo3.models.dao.Service
import retrofit2.*
import retrofit2.converter.gson.GsonConverterFactory

class CompsManager {
    private var compList: ArrayList<Comp> = ArrayList()
    companion object{
        private var instance:CompsManager?=null

        fun getInstance(): CompsManager{
            if(instance==null){
                instance= CompsManager()
            }
            return instance!!
        }

    }
    private constructor(){
        compList.add(Comp(1, "Iphone 12", 500))
        compList.add(Comp(2, "Pixel 5", 400))
        compList.add(Comp(3, "Samsung Galaxy S21", 500))
    }
//    fun getComps() :ArrayList<Comp>{
//        val retrofit = Retrofit.Builder().baseUrl("http://api.football-data.org/v2").addConverterFactory(GsonConverterFactory.create()).build()
//        val devicesSevice = retrofit.create<Service>()
//        devicesSevice.getDevices().enqueue(object : Callback<java.util.ArrayList<Comp>>
//        {
//            override fun onResponse(
//                call: Call<java.util.ArrayList<Comp>>,
//                response: Response<java.util.ArrayList<Comp>>
//            ) {
//                if(response.body()!= null){
//                    callback.on
//                }
//            }
//        }
//        )
//
//
//
//    }
fun getProducts() : ArrayList<Comp> {
    return compList
}

    fun addProduct(nombre : String, nroequipos : Int) : Unit {
        val product = Comp(compList.size+1, nombre , nroequipos)
        compList.add(product)
    }
}