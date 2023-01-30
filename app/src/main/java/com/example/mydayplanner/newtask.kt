package com.example.mydayplanner

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.mydayplanner.databinding.ActivityMainBinding
import com.example.mydayplanner.databinding.FragmentNewtaskBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment


class newtask : BottomSheetDialogFragment() {

    private lateinit var binding: FragmentNewtaskBinding
    private lateinit var taskViewModel: TaskViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        super.onCreate(savedInstanceState)
        val activity = requireActivity()
        taskViewModel = ViewModelProvider(activity).get(TaskViewModel::class.java)
        binding.submit.setOnClickListener{
            saveAction()
        }
    }

    private fun saveAction() {
        taskViewModel.name.value = binding.name.text.toString()
        taskViewModel.desc.value = binding.desc.text.toString()
        binding.name.setText("")
        binding.desc.setText("")
        dismiss()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {// !! You have made this non nullable type ok
        binding = FragmentNewtaskBinding.inflate(inflater,container,false)
        return binding.root
    }

}