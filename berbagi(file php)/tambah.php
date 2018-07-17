<?php
include 'koneksi.php';

if (isset($_POST["merk"]) && isset($_POST["tipe"]) && $_POST["keterangan"]) {
 
 $merk = $_POST["merk"];
 $tipe = $_POST["tipe"];
 $keterangan = $_POST["keterangan"];

 $query = "INSERT INTO hape (merk, tipe, keterangan) VALUES ('$merk', '$tipe', '$keterangan')";
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