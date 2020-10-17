-- Heitor Feijo Kunrath
--1
insere :: Int -> [Int] -> [Int]
insere x [] = x:[]
insere y (x : xs) = if y<=x then y:x:xs else x:insere y xs
-- em uma lista ordenada ela proccura o primeiro numero que é maior que o numero recebido por parâmetro e se bota no meio 
--2
ordenaInserse :: [Int] -> [Int]
ordenaInserse [] = []
ordenaInserse (x:xs) = insere x (ordenaInserse xs)
-- insertion sort que vai sempre se abrindo para ir se ordenando conforme a lista cresce e vai adicionando o proximo elemento conforme a recursão progride ( mais facl explicar visualmente)

funcJunta [] ys = ys
funcJunta (x:xs) ys = x:funcJunta ys xs
--funcJunta feita com ajuda do stack overflow https://stackoverflow.com/questions/3938438/merging-two-lists-in-haskell

--3
uneOrdenado :: [Int] -> [Int] -> [Int] 
uneOrdenado [] [] = []
uneOrdenado as [] = as
uneOrdenado [] as = as
uneOrdenado xs ys = ordenaInserse(funcJunta ys xs)
-- junta as listas recebidas por parametro  faz um ordenaInserse em cima 


--4
ordenaUne :: [Int] -> [Int]
ordenaUne [] = []
ordenaUne (x:xs)=    ordenaInserse( x:(ordenaUne (xs) ))

--5 
-- a função zipWith aplica uma função f a cada elemento das listas obtidas como parâmetros e a seus correspondentes, por exemplo: o primeiro com o primeiro, o segundo com o segundo, terceiro com o terceiro
-- então ela aplica a funcão f a cada elemento correspondente das listas e vai juntando os elementos que resultaram da propria funçãão f recursivamente com os outros elementos resultantes(que tinham como paramatros os elementos correspondentes das duas listas) que tambem foram aplicados a função f 

-- 6
