package pe.company.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import pe.company.R
import pe.company.databinding.FragmentInformacionBinding

class InformacionFragment : Fragment() {
    private lateinit var  binding : FragmentInformacionBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentInformacionBinding.inflate(inflater , container , false)
        return binding.root
    }

}