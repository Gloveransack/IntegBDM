var $j=jQuery;$j.noConflict();$j(document).ready(function(){    
$j('#ship-to-different-address-checkbox').removeAttr('checked');    
    $j("#ship-to-different-address-checkbox").change(function(e){e.preventDefault();        if($j(this).is(":checked")){            
            $j("#shipping_first_name").val($j('#billing_first_name').val());            $j("#shipping_last_name").val($j('#billing_last_name').val());            $j("#shipping_company").val($j('#billing_company').val());            $j("#shipping_address_1").val($j('#billing_address_1').val());            $j("#shipping_address_2").val($j('#billing_address_2').val());            $j("#shipping_city").val($j('#billing_city').val());            $j("#shipping_postcode").val($j('#billing_postcode').val());            $j("#shipping_state").val($j('#billing_state').val());            $j("#shipping_country").val($j('#billing_country').val());       }else{$j("div.billing-shipping").fadeIn("slow",function(){});            
            
        }
    });});