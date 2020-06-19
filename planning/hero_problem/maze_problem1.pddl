  
(define (problem p01)(:domain maze) (:requirements :strips :typing )

  (:objects 
  m1 m2 m3 m4 m5 m6 - maze
  
  )
  
  (:init (hero_at m1 )(monster_at m2)(monster_at m5) (near m1 m2)(near m2 m1)(near m1 m3)(near m3 m1) (near m2 m4) (near m4 m2 )
  (near m3 m4) (near m4 m3) (near m3 m5) ( near m5 m6) (near m4 m5)
  	
  ) 

  (:goal
    (hero_at m6)
  ))