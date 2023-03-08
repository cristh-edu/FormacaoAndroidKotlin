package com.alura.orgs.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.alura.orgs.R
import com.alura.orgs.model.Produto
import com.alura.orgs.ui.recyclerview.adapter.ListaProdutosAdapter
import java.math.BigDecimal

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val recyclerView: RecyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = ListaProdutosAdapter(
            context = this, produtos = listOf(
                Produto(
                    nome = "teste",
                    descricao = "test desc",
                    valor = BigDecimal("19.99")
                ),
                Produto(
                    nome = "teste 2",
                    descricao = "test desc",
                    valor = BigDecimal("19.99")
                )
            )
        )

    }
}