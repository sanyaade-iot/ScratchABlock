// Graph props:
//  estimated_params: {$r1}
//  name: None
//  trailing_jumps: True

// Predecessors: []
// Node props:
//  live_gen: set()
//  live_in: {$r1}
//  live_kill: set()
//  live_out: {$r1}
.ENTRY:
Exits: [(None, '20')]

// Predecessors: ['.ENTRY']
// Node props:
//  live_gen: {$r1}
//  live_in: {$r1}
//  live_kill: set()
//  live_out: set()
20:
func($r1)
return
Exits: []
