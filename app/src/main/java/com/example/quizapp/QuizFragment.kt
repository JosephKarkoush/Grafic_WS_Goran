package com.example.quizapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.quizapp.data.Statement
import com.example.quizapp.databinding.FragmentQuizBinding

class QuizFragment : Fragment() {

    private var _binding: FragmentQuizBinding? = null
    private val binding get() = _binding!!

    private var statementIndex = 0;
    private lateinit var currentStatement: Statement;

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentQuizBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val viewModel = activity?.run {
            ViewModelProvider(this)[SharedViewModel::class.java]
        }

        /*
        viewModel?.statements?.observe(viewLifecycleOwner) { statements ->


        }
        */

     }

    private fun handleStatement(flag: Boolean, statements: List<Statement>) {
        /*
        visa Toast som visar olika meddelande, beroende
        på om det aktuella påståendet är korrekt, och hur användaren svarat.
        Set sedan upp nästa statement.
         */
    }

    private fun getNext(st:List<Statement>){
        /*
        om index < antal element i st,
        set current till st i position index (?)
        uppdatera text i statementText.
        annars, visa game over meddelande
         */
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}