<?php  
 include 'db.php'; 
 $hasil         = mysql_query("SELECT * FROM kampanye") or die(mysql_error());
 $json_response = array();
 
if(mysql_num_rows($hasil)> 0){
 while ($row = mysql_fetch_array($hasil)) {
     $json_response[] = $row;
 }
 echo json_encode(array('bagi' => $json_response));
} 
?>