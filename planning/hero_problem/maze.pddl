(define (domain maze)

    (:requirements :strips  :typing)
    (:predicates (hero_at ?m1 - maze)
    (s_with )(s_at ?a - maze) (near ?a1 - maze ?a2 - maze)
    (hero_has_been ?m1 - maze)( monster_at ?a - maze)( trap_at ?a - maze )
    )
    (:types maze
    )

    (:action move_hero
    :parameters (?from - maze ?to - maze)
    :precondition (and (near ?from ?to ) 
    ( hero_at ?from)
    (not(hero_has_been ?to))
    (not(monster_at ?from)) 
    (not(trap_at ?from )) )
    :effect (and (not(hero_at ?from)) 
    (hero_at ?to) 
    (hero_has_been ?to))
    )
    (:action pick_sword
    :parameters(?a - maze)
    :precondition (and (s_at ?a) (hero_at ?a))
    :effect (and ( s_with ) 
    (not(s_at ?a)) )
    )
    (:action drop_sword
    :parameters (?a - maze)
    :precondition (and (hero_at ?a) (s_with))
    :effect (and  (not(s_with))
     (s_at ?a))
    )
    (:action slay_monster
    :parameters ( ?a - maze)
    :precondition (and(hero_at ?a) (monster_at ?a ) (s_with) )
    :effect (not(monster_at ?a) )
    )
    (
    :action untrap
    :parameters ( ?a - maze)
    :precondition (and (trap_at ?a) 
    (hero_at ?a) 
    (not(s_with))
    (not(s_at ?a)) )
    :effect (not (trap_at ?a))
    )


)
