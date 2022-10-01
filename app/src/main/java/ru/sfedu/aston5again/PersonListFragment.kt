package ru.sfedu.aston5again

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.fragment.app.Fragment
import ru.sfedu.aston5again.databinding.FragmentPersonListBinding


class PersonListFragment : Fragment() {

    private lateinit var binding: FragmentPersonListBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPersonListBinding.inflate(inflater, container, false)


        val persons = contract().personService.persons
        val adapter = ArrayAdapter(requireContext(), android.R.layout.simple_list_item_1, persons)
        binding.personListView.adapter = adapter
        binding.personListView.setOnItemClickListener { _, _, position, _ ->
            val currentPerson = adapter.getItem(position)!!
            contract().launchPersonDetailsScreen(currentPerson)
        }

        return binding.root
    }

}