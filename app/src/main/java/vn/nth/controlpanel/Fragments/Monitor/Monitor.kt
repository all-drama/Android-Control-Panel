package vn.nth.controlpanel.Fragments.Monitor

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import vn.nth.controlpanel.databinding.FragmentMonitorBinding

class Monitor : Fragment() {
    private lateinit var binding : FragmentMonitorBinding;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMonitorBinding.inflate(layoutInflater)
        return binding.root
    }
}