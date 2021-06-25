package pe.edu.ulima.pm.melendez_hualpa_trabajo3.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import pe.edu.ulima.pm.melendez_hualpa_trabajo3.R
import pe.edu.ulima.pm.melendez_hualpa_trabajo3.models.beans.Comp

interface OnCompItemClickListener {
    fun onClick(comp : Comp)
}

class CompRVAdapter : RecyclerView.Adapter<CompRVAdapter.ViewHolder>{
    class ViewHolder : RecyclerView.ViewHolder {
        var tviCompNombre : TextView? = null
        var tviCompNroequipos : TextView? = null

        constructor(view : View) : super(view) {
            tviCompNombre = view.findViewById(R.id.tviCompNombre)
            tviCompNroequipos = view.findViewById(R.id.tviCompNroequipos)
        }
    }
//edgar
    private var comps : ArrayList<Comp>? = null
    private var listener : OnCompItemClickListener? = null
    private var context : Context? = null

    constructor(comps : ArrayList<Comp>,
                listener : OnCompItemClickListener,
                context : Context
    ) : super(){
        this.comps = comps
        this.listener = listener
        this.context = context
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(
                R.layout.item_comp, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val comp = comps!![position]

        holder.tviCompNombre!!.text = comp.nombre
        holder.tviCompNroequipos!!.text = comp.nroequipos.toString()

        holder.itemView.setOnClickListener { v : View ->
            listener!!.onClick(comps!![position])
        }
    }

    override fun getItemCount(): Int {
        return comps!!.size;
    }
}