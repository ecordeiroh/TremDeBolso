package br.gov.cbtu.tremdebolso;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

/**
 * Created by ecordeiro on 27/04/2016.
 */
public class CustomMapFragment extends Fragment implements OnMapReadyCallback {
    SupportMapFragment supportMapFragment;
    private int typeMap;
    private View rootView;

    public static CustomMapFragment newInstance(int typeMap) {
        CustomMapFragment fragment = new CustomMapFragment();
        Bundle args = new Bundle();
        args.putInt("typeMap", typeMap);
        fragment.setArguments(args);
        return fragment;
    }

    public CustomMapFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            typeMap = getArguments().getInt("typeMap"); //Recupera o tipo do mapa passado por parâmetro
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        supportMapFragment = SupportMapFragment.newInstance();
        rootView = inflater.inflate(R.layout.fragment_custom_map, null);
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            fragmentManager.beginTransaction().replace(R.id.map, supportMapFragment).commitAllowingStateLoss();
        }
        supportMapFragment.getMapAsync(this);
        return rootView;
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        switch (typeMap) {
            case MainEstacoesMapa.TYPE_MAP_BASIC:
                configBasicMap(googleMap);
                break;
        }
    }

    private void configBasicMap(GoogleMap googleMap) {

        // Linha NORTE
        LatLng alecrim = new LatLng(-27.6584985, -54.7644169);

        googleMap.addMarker(new MarkerOptions()
                .title("Estação Alecrim 1")
                .snippet("Linha Norte")
                .position(alecrim));

        LatLng igapo = new LatLng(-5.771237, -35.2510822);

        googleMap.addMarker(new MarkerOptions()
                .title("Estação Igapo")
                .snippet("Linha Norte")
                .position(igapo));

        LatLng stacatarina = new LatLng(-5.7564649, -35.2417672);

        googleMap.addMarker(new MarkerOptions()
                .title("Estação Santa Catarina")
                .snippet("Linha Norte")
                .position(stacatarina));

        LatLng soledade = new LatLng(-5.7523102, -35.2516662);

        googleMap.addMarker(new MarkerOptions()
                .title("Estação Soledade")
                .snippet("Linha Norte")
                .position(soledade));

        LatLng novanatal = new LatLng(-5.737896, -35.269977);

        googleMap.addMarker(new MarkerOptions()
                .title("Estação Nova Natal")
                .snippet("Linha Norte")
                .position(novanatal));

        LatLng nordelandia = new LatLng(-5.7285355, -35.2766692);
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(nordelandia, 11));
        googleMap.addMarker(new MarkerOptions()
                .title("Estação Nordelândia")
                .snippet("Linha Norte")
                .position(nordelandia));

        LatLng estrelamar = new LatLng(-5.707582, -35.2888051);

        googleMap.addMarker(new MarkerOptions()
                .title("Estação Estrela do Mar")
                .snippet("Linha Norte")
                .position(estrelamar));

        LatLng extremos = new LatLng(-5.70613826, -35.30484438);

        googleMap.addMarker(new MarkerOptions()
                .title("Estação Extremos")
                .snippet("Linha Norte")
                .position(extremos));

        /*LatLng raposa = new LatLng(-5.707582, -35.2888051);

        googleMap.addMarker(new MarkerOptions()
                .title("Estação Estrela do Mar")
                .snippet("Linha Norte")
                .position(raposa));*/

        LatLng massangana = new LatLng(-5.6463886, -35.3519336);

        googleMap.addMarker(new MarkerOptions()
                .title("Estação Massangana")
                .snippet("Linha Norte")
                .position(massangana));

        LatLng lagoagrande = new LatLng(-5.6367207, -35.3862363);

        googleMap.addMarker(new MarkerOptions()
                .title("Estação Lagoa Grande")
                .snippet("Linha Norte")
                .position(lagoagrande));

        LatLng cearamirim = new LatLng(-5.6321899, -35.4213437);

        googleMap.addMarker(new MarkerOptions()
                .title("Estação Ceará-Mirim")
                .snippet("Estação Final Norte")
                .position(cearamirim));








        // Linha SUL



        LatLng ribeira = new LatLng(-5.7802805, -35.206154); //Cria uma coordenada de ponto para o mapa
        //Configura o zoom da camera do mapa
        // googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(ribeira, 11));

        /**
         * Adiciona um pino na posição da coordenada.
         * Ao clicar em cima do pino exibirá o título Sidney e a descrição que está no snippet
         */
        googleMap.addMarker(new MarkerOptions()
                .title("Estação Ribeira")
                .snippet("Estação Central")
                .position(ribeira));


        LatLng jmaria = new LatLng(-5.8035815, -35.2268494); //Cria uma coordenada de ponto para o mapa
        //Configura o zoom da camera do mapa
        //googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(jmaria, 13));

        /**
         * Adiciona um pino na posição da coordenada.
         * Ao clicar em cima do pino exibirá o título Sidney e a descrição que está no snippet
         */
        googleMap.addMarker(new MarkerOptions()
                .title("Estação Padre João Maria")
                .snippet("Linha Sul")
                .position(jmaria));


        LatLng bpastor = new LatLng(-5.8116255, -35.2353862); //Cria uma coordenada de ponto para o mapa
        //Configura o zoom da camera do mapa
        //googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(bpastor, 10));

        /**
         * Adiciona um pino na posição da coordenada.
         * Ao clicar em cima do pino exibirá o título Sidney e a descrição que está no snippet
         */
        googleMap.addMarker(new MarkerOptions()
                .title("Estação Bom Pastor")
                .snippet("Linha Sul")
                .position(bpastor));





        LatLng cespereanca = new LatLng(-5.8226367, -35.2426141); //Cria uma coordenada de ponto para o mapa
        //Configura o zoom da camera do mapa
        //googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(cespereanca, 13));

        /**
         * Adiciona um pino na posição da coordenada.
         * Ao clicar em cima do pino exibirá o título Sidney e a descrição que está no snippet
         */
        googleMap.addMarker(new MarkerOptions()
                .title("Estação Cidade Espereança")
                .snippet("Linha Sul")
                .position(cespereanca));




        LatLng promorar = new LatLng(-5.8331713, -35.2452292); //Cria uma coordenada de ponto para o mapa
        //Configura o zoom da camera do mapa
        // googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(promorar, 13));

        /**
         * Adiciona um pino na posição da coordenada.
         * Ao clicar em cima do pino exibirá o título Sidney e a descrição que está no snippet
         */
        googleMap.addMarker(new MarkerOptions()
                .title("Estação Prómorar")
                .snippet("Linha Sul")
                .position(promorar));



        LatLng pitimbu = new LatLng(-5.8459553, -35.2449157); //Cria uma coordenada de ponto para o mapa
        //Configura o zoom da camera do mapa
        //googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(pitimbu, 13));

        /**
         * Adiciona um pino na posição da coordenada.
         * Ao clicar em cima do pino exibirá o título Sidney e a descrição que está no snippet
         */
        googleMap.addMarker(new MarkerOptions()
                .title("Estação Pitimbu")
                .snippet("Linha Sul")
                .position(pitimbu));



        LatLng csatelite = new LatLng(-5.8547965, -35.247626); //Cria uma coordenada de ponto para o mapa
        //Configura o zoom da camera do mapa
        //googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(csatelite, 13));

        /**
         * Adiciona um pino na posição da coordenada.
         * Ao clicar em cima do pino exibirá o título Sidney e a descrição que está no snippet
         */
        googleMap.addMarker(new MarkerOptions()
                .title("Estação Cidade Satélite")
                .snippet("Linha Sul")
                .position(csatelite));

        LatLng jaeroporto = new LatLng(-5.8827557, -35.2551728); //Cria uma coordenada de ponto para o mapa
        //Configura o zoom da camera do mapa
        //googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(jaeroporto, 13));

        /**
         * Adiciona um pino na posição da coordenada.
         * Ao clicar em cima do pino exibirá o título Sidney e a descrição que está no snippet
         */
        googleMap.addMarker(new MarkerOptions()
                .title("Estação Jardim Aeroporto")
                .snippet("Linha Sul")
                .position(jaeroporto));

        LatLng parnamirim = new LatLng(-5.918795, -35.2691468); //Cria uma coordenada de ponto para o mapa
        //Configura o zoom da camera do mapa
        //googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(parnamirim, 13));

        /**
         * Adiciona um pino na posição da coordenada.
         * Ao clicar em cima do pino exibirá o título Sidney e a descrição que está no snippet
         */
        googleMap.addMarker(new MarkerOptions()
                .title("Estação Parnamirim")
                .snippet("Estação Final Sul")
                .position(parnamirim));

    }



}
