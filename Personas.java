package com.example.german.myapplication;

/**
 * Created by German on 17/09/2016.
 */
    public class Personas {

        private int _id;
        private String _nombre;
        private String _apellido;
        private int _edad;
        private String _telefono;
        private String _email;

    public Personas() {
    }

    public Personas(String s1, String string, int i, String toString, String s){
            //Constructor Vacio
        }
        public Personas(String nombre, String apellido, int edad, String telefono, String email, String tiposangre) {
            this._nombre = nombre;
            this._apellido = apellido;
            this._edad = edad;
            this._telefono = telefono;
            this._email = email;
        }

        public int get_id() {
            return _id;
        }

        public void set_id(int _id) {
            this._id = _id;
        }

        public String get_nombre() {
            return _nombre;
        }

        public void set_nombre(String _nombre) {
            this._nombre = _nombre;
        }

        public String get_apellido() {
            return _apellido;
        }

        public void set_apellido(String _apellido) {
            this._apellido = _apellido;
        }

        public int get_edad() {
            return _edad;
        }

        public void set_edad(int _edad) {
            this._edad = _edad;
        }

        public String get_telefono() {
            return _telefono;
        }

        public void set_telefono(String _telefono) {
            this._telefono = _telefono;
        }

        public String get_email() {
            return _email;
        }

        public void set_email(String _email) {
            this._email = _email;
        }

    }


