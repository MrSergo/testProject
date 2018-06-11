import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.user.kotlinapp.Classes.User
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Integer.parseInt


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        logining()

            }
    fun logining(){
        buttonClick.setOnClickListener{
            val user= User()
            if(editText1.length()>2){
            user.login= editText1.text.toString()}

            user.password= editText2.text.toString()
            val intent= Intent(this, SecondActivity::class.java )
            intent.putExtra("login", user.login)
            intent.putExtra("pass", user.password)
            startActivity(intent)

        }
    }
        }