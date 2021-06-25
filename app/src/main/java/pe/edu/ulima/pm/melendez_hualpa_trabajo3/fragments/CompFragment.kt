package pe.edu.ulima.pm.melendez_hualpa_trabajo3.fragments

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import pe.edu.ulima.pm.melendez_hualpa_trabajo3.R
import pe.edu.ulima.pm.melendez_hualpa_trabajo3.models.beans.Comp
import java.util.ArrayList

class CompFragment : Fragment(){
    var rviComp : RecyclerView? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_comp, container, false)
    }

    @SuppressLint("UseRequireInsteadOfGet")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        rviComp = view!!.findViewById(R.id.rviComp)
    }


//    override fun onSuccess(products: ArrayList<Comp>) {
//        activity!!.runOnUiThread {
//            //val productsAdapter = ProductsAdapter(activity as Context, productsList)
//            val productsRVAdapter = ProductsRVAdapter(products, this, activity!!)
//            //lviProducts!!.adapter = productsAdapter
//            rviProducts!!.adapter = productsRVAdapter
//        }
//
//    }
//
//    override fun onError(msg: String) {
//        Log.e("ProductsFragment", msg)
//    }

//    override fun onClick(comp: Comp) {
//        TODO("Not yet implemented")
//    }
}