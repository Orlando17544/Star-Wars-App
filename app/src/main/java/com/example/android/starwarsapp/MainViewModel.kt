package com.example.android.starwarsapp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.android.starwarsapp.character.CharacterImage

class MainViewModel : ViewModel() {
    private var _characters = MutableLiveData<List<Character>>();

    val characters: LiveData<List<Character>>
        get() = _characters

    lateinit var characterImages: Array<CharacterImage>;

    init {
        characterImages = arrayOf(
            CharacterImage("Anakin Skywalker", R.drawable.anakin_skywalker),
            CharacterImage("Wilhuff Tarkin", R.drawable.wilhuff_arkin),
            CharacterImage("Chewbacca", R.drawable.chewbacca),
            CharacterImage("Han Solo", R.drawable.han_solo),
            CharacterImage("Greedo", R.drawable.greedo),
            CharacterImage("Jabba Desilijic Tiure", R.drawable.jabba_desilijic_tiure),
            CharacterImage("Wedge Antilles", R.drawable.wedge_antilles),
            CharacterImage("Jek Tono Porkins", R.drawable.jek_tono_porkins),
            CharacterImage("Yoda", R.drawable.yoda),
            CharacterImage("Palpatine", R.drawable.palpatine),
            CharacterImage("Boba Fett", R.drawable.boba_fett),
            CharacterImage("IG-88", R.drawable.ig_88),
            CharacterImage("Bossk", R.drawable.bossk),
            CharacterImage("Lando Calrissian", R.drawable.lando_calrissian),
            CharacterImage("Lobot", R.drawable.lobot),
            CharacterImage("Ackbar", R.drawable.ackbar),
            CharacterImage("Mon Mothma", R.drawable.mon_mothma),
            CharacterImage("Arvel Crynyd", R.drawable.arvel_crynyd),
            CharacterImage("Wicket Systri Warrick", R.drawable.wicket_systri_warrick),
            CharacterImage("Nien Nunb", R.drawable.nien_nunb),
            CharacterImage("Luke Skywalker", R.drawable.luke_skywalker),
            CharacterImage("C-3PO", R.drawable.c_3po),
            CharacterImage("R2-D2", R.drawable.r2_d2),
            CharacterImage("Darth Vader", R.drawable.darth_vader),
            CharacterImage("Leia Organa", R.drawable.leia_organa),
            CharacterImage("Owen Lars", R.drawable.owen_lars),
            CharacterImage("Beru Whitesun lars", R.drawable.beru_whitesun_lars),
            CharacterImage("R5-D4", R.drawable.r5_d4),
            CharacterImage("Biggs Darklighter", R.drawable.biggs_darklighter),
            CharacterImage("Obi-Wan Kenobi", R.drawable.obi_wan_kenobi),
            CharacterImage("Qui-Gon Jinn", R.drawable.qui_gon_jinn),
            CharacterImage("Nute Gunray", R.drawable.nute_gunray),
            CharacterImage("Finis Valorum", R.drawable.finis_valorum),
            CharacterImage("Padmé Amidala", R.drawable.padme_amidala),
            CharacterImage("Jar Jar Binks", R.drawable.jar_jar_binks),
            CharacterImage("Roos Tarpals", R.drawable.roos_tarpals),
            CharacterImage("Rugor Nass", R.drawable.rugor_nass),
            CharacterImage("Ric Olié", R.drawable.ric_olie),
            CharacterImage("Watto", R.drawable.watto),
            CharacterImage("Sebulba", R.drawable.sebulba))
    }
}