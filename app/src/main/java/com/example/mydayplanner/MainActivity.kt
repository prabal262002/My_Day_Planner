package com.example.mydayplanner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.mydayplanner.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding
    private lateinit var taskViewModel: TaskViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        taskViewModel = ViewModelProvider(this)[TaskViewModel::class.java]
        binding.newTaskButton.setOnClickListener {
            newtask().show(supportFragmentManager,"newTaskTag")
        }
        taskViewModel.name.observe(this){
            binding.taskName.text = String.format("Task Name : %s",it)
        }
        taskViewModel.desc.observe(this){
            binding.descName.text = String.format("Description : %s",it)
        }
    }
}