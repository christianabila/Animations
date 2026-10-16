<?php

system('clear');
$output = ["|", "\\", "—", "/"];
$i = 0;
while (true) {
    if ($i == 4) {
        $i = 0;
    }
    echo $output[$i];
    usleep(90000);
    system('clear');
    $i++;
}
