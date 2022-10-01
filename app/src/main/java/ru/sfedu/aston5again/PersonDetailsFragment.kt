package ru.sfedu.aston5again

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import ru.sfedu.aston5again.databinding.FragmentPersonDetailsBinding
import ru.sfedu.aston5again.model.Person

class PersonDetailsFragment : Fragment() {

    private lateinit var binding: FragmentPersonDetailsBinding

    val person: Person
        get() = requireArguments().getSerializable(PERSON_ARGUMENT) as Person

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPersonDetailsBinding.inflate(inflater, container, false)
        binding.nameTextView.text = person.name
        binding.secondNameTextVew.text = person.secondName
        binding.phoneTextVew.text = person.phone.toString()
        return binding.root
    }

    companion object {
        private const val PERSON_ARGUMENT = "PERSON_ARGUMENT"

        fun newInstance(person: Person): PersonDetailsFragment {

            val fragment = PersonDetailsFragment()
            fragment.arguments = bundleOf(PERSON_ARGUMENT to person)
            return fragment
        }
    }
}