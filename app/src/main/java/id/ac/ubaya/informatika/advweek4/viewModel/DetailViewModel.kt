package id.ac.ubaya.informatika.advweek4.viewModel

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import id.ac.ubaya.informatika.advweek4.model.Student

class DetailViewModel: ViewModel() {
    val studentsLD = MutableLiveData<ArrayList<Student>>()
    fun fetch(id:String, name:String, bod:String, phone: String, url:String) {
        val student1 = Student(id,name,bod,phone,url)
        studentsLD.value = student1
    }
}