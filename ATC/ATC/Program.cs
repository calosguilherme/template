using ATC.SUBALUNO.BLL.CDP;
using ATC.SUBALUNO.BLL.CGT;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ATC
{
    class Program
    {
        static void Main(string[] args)
        {
            Aluno a = new Aluno();

            AplEnvioAtividade envio = new AplEnvioAtividade();
            List<String> lstdocumento = new List<String>();
            lstdocumento.Add("Atividade");
            envio.efetuarEnvio(a, lstdocumento);
            
            Console.ReadKey();
        }
    }
}
