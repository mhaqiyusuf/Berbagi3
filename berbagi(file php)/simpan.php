<?php
include 'db.php';

if (isset($_POST["judul"]) && isset($_POST["isi"]) && $_POST["jumlah"]) {
 
 $judul = $_POST["judul"];
 $isi = $_POST["isi"];
 $jumlah = $_POST["jumlah"];

 $query = "INSERT INTO kampanye (judul, isi, jumlah) VALUES ('$judul', '$isi', '$jumlah')";
 $eksekusi = mysql_query($query);

 if ($eksekusi) {
  
  $response['result'] = true;
  $response['pesan'] = "Data tersimpan";
  echo json_encode($response);
 } else {
  $response['result'] = false;
  $response['pesan'] = "Data gagal tersimpan";
  echo json_encode($response);
 }
 
} else {
 $response['result']= false ;
    $response['msg']="Ada kesalahan";
    echo json_encode($response);
}
?>