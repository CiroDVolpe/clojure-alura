(defn imprime-mensagem [] 
  (println "-----------")
	(println "Bem vindi ao estoque!"))

(imprime-mensagem)

(defn valor-descontado 
	"Retorna o valor com desconto de 10% porcento"
	[valor-bruto]
	(* valor-bruto (- 1 0.10)))

(valor-descontado 100)