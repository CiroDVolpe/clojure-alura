(defn valor-descontado 
	"Retorna o valor com desconto de 10% porcento se o valor bruto for extritamente maior que 100%"
	[valor-bruto]
	(if (> valor-bruto 100)
		(let [taxa-de-desconto (/ 10 100)
			desconto (* valor-bruto taxa-de-desconto)]
		(println "calculando desconto de" desconto)
		(- valor-bruto desconto))
		valor-bruto))
	

(valor-descontado 1000) ; espera passar no if
(valor-descontado 100) ; espera falhar no if

(if (> 500 100)
	(println "maior")
	(println "menor ou igual"))

	(if (> 50 100)
	(println "maior")
	(println "menor ou igual"))