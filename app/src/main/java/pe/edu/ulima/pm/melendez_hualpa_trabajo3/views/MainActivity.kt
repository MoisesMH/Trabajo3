package pe.edu.ulima.pm.melendez_hualpa_trabajo3.views

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import pe.edu.ulima.pm.melendez_hualpa_trabajo3.R
import pe.edu.ulima.pm.melendez_hualpa_trabajo3.fragments.CompFragment

class MainActivity : AppCompatActivity() {
    var dlaMain : DrawerLayout? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nviMain = findViewById<NavigationView>(R.id.nviMain)
        dlaMain = findViewById(R.id.dlaMain)

        nviMain.setNavigationItemSelectedListener { item : MenuItem ->
            // Se quede como chequeado
            item.setChecked(true)
            val ft = supportFragmentManager.beginTransaction()
            ft.replace(R.id.flaContent,CompFragment() )
            // TODO: Abrir el fragment correspondiente la opcion del menu
            // Cerrar la opcion del menu una vez que se selecciona un item
            ft.addToBackStack(null)
            ft.commit()
            dlaMain!!.closeDrawers()

            true
        }

    }

    override fun onBackPressed() {
        super.onBackPressed()
        dlaMain!!.closeDrawers()
    }
}