﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ATC.SUBALUNO.BLL.CDP
{
    class Atividade
    {
        private int valorCredito;
        private DateTime anoRegistro;
        private String uniAvali;
        private String tipoAtividade;
        private bool ativo;
        private Categoria cat;

        public Atividade()
        {
        }

        public int ValorCredito { get => valorCredito; set => valorCredito = value; }
        public DateTime AnoRegistro { get => anoRegistro; set => anoRegistro = value; }
        public string UniAvali { get => uniAvali; set => uniAvali = value; }
        public string TipoAtividade { get => tipoAtividade; set => tipoAtividade = value; }
        public bool Ativo { get => ativo; set => ativo = value; }
        internal Categoria Cat { get => cat; set => cat = value; }
    }
}
