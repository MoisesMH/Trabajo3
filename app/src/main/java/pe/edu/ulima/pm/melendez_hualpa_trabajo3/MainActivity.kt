package pe.edu.ulima.pm.melendez_hualpa_trabajo3

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

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
            // TODO: Abrir el fragment correspondiente la opcion del menu
            // Cerrar la opcion del menu una vez que se selecciona un item
            dlaMain!!.closeDrawers()
            true
        }

    }
}