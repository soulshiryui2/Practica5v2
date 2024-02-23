package mx.edu.potros.practica5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        var btnAntojitos: Button = findViewById(R.id.btnAntojitos) as Button
        var btnEspecialidades: Button = findViewById(R.id.btnEspe) as Button
        var btnCombinaciones: Button = findViewById(R.id.btnCombi) as Button
        var btnTortas: Button = findViewById(R.id.btnTortas) as Button
        var btnSopas: Button = findViewById(R.id.btnSopas) as Button
        var btnBebidas: Button = findViewById(R.id.btnDrink) as Button

        btnAntojitos.setOnClickListener {
            var intent = Intent(this, Productos_activity::class.java)
            intent.putExtra("menuType", "Antojitos")
            startActivity(intent)
        }
        btnEspecialidades.setOnClickListener {
            var intent = Intent(this, Productos_activity::class.java)
            intent.putExtra("menuType", "Especialidades")
            startActivity(intent)
        }
        btnCombinaciones.setOnClickListener {
            var intent = Intent(this, Productos_activity::class.java)
            intent.putExtra("menuType", "Combinations")
            startActivity(intent)
        }
        btnTortas.setOnClickListener {
            var intent = Intent(this, Productos_activity::class.java)
            intent.putExtra("menuType", "Tortas")
            startActivity(intent)
        }
        btnSopas.setOnClickListener {
            var intent = Intent(this, Productos_activity::class.java)
            intent.putExtra("menuType", "Sopas")
            startActivity(intent)
        }
        btnBebidas.setOnClickListener {
            var intent = Intent(this, Productos_activity::class.java)
            intent.putExtra("menuType", "Bebidas")
            startActivity(intent)
        }
    }
}
