using ATC.CONTROLEATIVIDADE.BLL.CGT;
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

            List<Arquivo> lstArquivo = new List<Arquivo>();

            Arquivo arq1 = new Arquivo();
            arq1.Arq = "Arquivo 1";

            Arquivo arq2 = new Arquivo();
            arq2.Arq = "Arquivo 2";

            Arquivo arq3 = new Arquivo();
            arq3.Arq = "Arquivo 3";

            lstArquivo.Add(arq1);
            lstArquivo.Add(arq2);
            lstArquivo.Add(arq3);


            AplAvaliaAtividade avalia = new AplAvaliaAtividade();
            avalia.avaliarAtividade(lstArquivo);
            Console.ReadKey();
        }
    }
}
