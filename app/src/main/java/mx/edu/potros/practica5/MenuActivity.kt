package mx.edu.potros.practica5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val btnAntojitos: Button? = findViewById(R.id.btnAntojitos)
        val btnEspecialidades: Button? = findViewById(R.id.btnespecialidades)
        val btnCombinaciones: Button? = findViewById(R.id.btncombinaciones)
        val btnTortas: Button? = findViewById(R.id.btntortas)
        val btnSopas: Button? = findViewById(R.id.btnsopas)
        val btnBebidas: Button? = findViewById(R.id.btndrinks)

        btnAntojitos?.setOnClickListener {
            val intent = Intent(this, Productos_activity::class.java)
            intent.putExtra("menuType", "Antojitos")
            startActivity(intent)
        }
        btnEspecialidades?.setOnClickListener {
            val intent = Intent(this, Productos_activity::class.java)
            intent.putExtra("menuType", "Especialidades")
            startActivity(intent)
        }
        btnCombinaciones?.setOnClickListener {
            val intent = Intent(this, Productos_activity::class.java)
            intent.putExtra("menuType", "Combinations")
            startActivity(intent)
        }
        btnTortas?.setOnClickListener {
            val intent = Intent(this, Productos_activity::class.java)
            intent.putExtra("menuType", "Tortas")
            startActivity(intent)
        }
        btnSopas?.setOnClickListener {
            val intent = Intent(this, Productos_activity::class.java)
            intent.putExtra("menuType", "Sopas")
            startActivity(intent)
        }
        btnBebidas?.setOnClickListener {
            val intent = Intent(this, Productos_activity::class.java)
            intent.putExtra("menuType", "Bebidas")
            startActivity(intent)
        }
    }
}
